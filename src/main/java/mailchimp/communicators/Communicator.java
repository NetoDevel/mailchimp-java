package mailchimp.communicators;

import mailchimp.attributes.Authentication;
import mailchimp.attributes.DataCenterMailChimp;

/**
 * 
 * @author Jose
 * Interface respons�vel por autentica��o HTTP BASIC AUTHENTICATION por cada requisi��o
 */
public interface Communicator {

	public <T> T build(final Class<T> clazz, final Authentication authentication, DataCenterMailChimp dataCenterMailChimp);

}
