/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsgenexample;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServerInfo{

	@WebMethod
	public String getIpAddress() {

		return "10.10.10.10";

	}

}