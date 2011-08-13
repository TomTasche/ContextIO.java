package at.tomtasche.contextio;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

public class ContextIOApi extends DefaultApi10a {

	@Override
	public String getAccessTokenEndpoint() {
		throw new UnsupportedOperationException("No endpoint for access token.");
	}

	@Override
	public String getAuthorizationUrl(Token arg0) {
		throw new UnsupportedOperationException("No authorization url.");
	}

	@Override
	public String getRequestTokenEndpoint() {
		throw new UnsupportedOperationException("No endpoint for request token.");
	}
}
