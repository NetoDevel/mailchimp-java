package mailchimp.communicators;

import mailchimp.attributes.Authentication;

/**
 * 
 * @author Jose
 * Interface respons�vel por autentica��o HTTP BASIC AUTHENTICATION por cada requisi��o
 */
public interface Communicator {

	public <T> T build(final Class<T> clazz, final Authentication authentication);

}
