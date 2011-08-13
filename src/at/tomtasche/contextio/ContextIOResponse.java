package at.tomtasche.contextio;

import java.util.Map;

import org.scribe.model.Response;

/**
 * 
 * @author Thomas Taschauer | tomtasche.at
 *
 */
public class ContextIOResponse {

	int code;
	Map<String, String> headers;
	Map<String, String> requestHeaders;
	Map<String, String> responseHeaders;
	String contentType;
	Response rawResponse;
	boolean hasError;
	
	
	public ContextIOResponse(int code, Map<String, String> requestHeaders, Map<String, String> responseHeaders, Response rawResponse) {
		this.code = code;
		this.requestHeaders = requestHeaders;
		this.responseHeaders = responseHeaders;
		this.rawResponse = rawResponse;
		this.contentType = rawResponse.getHeader("Content-Type");
		// TODO: this.headers = ;
	}
	
	
	public void decodeResponse() {
		if (code != 200 || !contentType.equals("application/json")) {
			hasError = true;
		} else {
			// TODO: decode json response to rawResponse
			
			// TODO: if (array_key_exists('messages', $this->decodedResponse) && (count($this->decodedResponse['messages']) > 0)) hasError = true;
		}
	}


	@Override
	public String toString() {
		return "ContextIOResponse [code=" + code + ", headers=" + headers
				+ ", requestHeaders=" + requestHeaders + ", responseHeaders="
				+ responseHeaders + ", contentType=" + contentType
				+ ", rawResponse=" + rawResponse + ", hasError=" + hasError
				+ ", response=" + rawResponse.getBody() + "]";
	}
}
