package com.pradip.spring.social.web.controller;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.pradip.spring.social.web.config.SocialServiceProvider;

import static com.pradip.spring.social.web.SessionAttributes.*;
import static org.springframework.web.context.request.RequestAttributes.*;
/**
 * @author Pradip
 *
 */
@Controller
public class FacebookController {

	@Autowired
	@Qualifier("facebookServiceProvider")
	SocialServiceProvider facebookServiceProvider; 
	
	private static final Token EMPTY_TOKEN = null;
	
	@RequestMapping(value={"/login-facebook"}, method=RequestMethod.GET)
	public String login(WebRequest request)
	{
	
		// getting request and access token from session
	Token accessToken=(Token)request.getAttribute(ATTR_OAUTH_ACCESS_TOKEN, SCOPE_SESSION);
		if(accessToken==null)
		{
			// generate new request token
		OAuthService authService=facebookServiceProvider.getServiceProvider();
		request.setAttribute(ATTR_OAUTH_REQUEST_TOKEN, EMPTY_TOKEN, SCOPE_SESSION);
		return "redirect:"+authService.getAuthorizationUrl(EMPTY_TOKEN);
		}
		
		return "homePage";
	}
	
	@RequestMapping(value={"/facebook-callback"} , method=RequestMethod.GET)
	public ModelAndView callback(@RequestParam(value="code",required=false) String oauthVerifier,WebRequest request)
	{
		System.out.println("facebook call back method");
		
		// getting request token
		OAuthService authService=facebookServiceProvider.getServiceProvider();
		Token requestToken=(Token)request.getAttribute(ATTR_OAUTH_REQUEST_TOKEN, SCOPE_SESSION);
		
		// getting access token
		Verifier verifier=new Verifier(oauthVerifier);
		Token accessToken=authService.getAccessToken(requestToken, verifier);
		
		// store access token as a session attribute
		request.setAttribute(ATTR_OAUTH_ACCESS_TOKEN,accessToken, SCOPE_SESSION);
		
		// getting user profile
		OAuthRequest oauthRequest = new OAuthRequest(Verb.GET, "https://graph.facebook.com/me");
		authService.signRequest(accessToken, oauthRequest);
		Response oauthResponse = oauthRequest.send();
		System.out.println(oauthResponse.getBody());
		
		//ModelAndView mav = new ModelAndView("redirect:pradip");
		
		ModelAndView mav = new ModelAndView("homePage");
		mav.addObject("info", oauthResponse.getBody());
		return mav;
		
	}
	
	
}
