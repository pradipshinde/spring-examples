package com.pradip.spring.social.web.config;

import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;

/**
 * @author Pradip
 *
 */
public class SocialServiceProvider {

	private SocialServiceContext serviceContext;

	
	
	public SocialServiceProvider(SocialServiceContext serviceContext) {
		this.serviceContext = serviceContext;
	}

	public OAuthService getServiceProvider()
	{
		System.out.println(serviceContext);
	
		return new ServiceBuilder()
				.apiKey(serviceContext.getApiKey())
				.apiSecret(serviceContext.getApiSecret())
				.callback(serviceContext.getCallback())
				.provider(serviceContext.getApiClass()).build();
	}
	
}
