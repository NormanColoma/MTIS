/**
 * SportCenterServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.example.www.sportcenterservice;

import java.util.ArrayList;

/**
 * SportCenterServiceSkeleton java skeleton for the axisService
 */
public class SportCenterServiceSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param getSportCenters
	 * @return getSportCentersResponse
	 */

	public org.example.www.sportcenterservice.GetSportCentersResponse getSportCenters(
			org.example.www.sportcenterservice.GetSportCenters getSportCenters) {
		BDConnector bd = new BDConnector();
		ArrayList<Integer> centers = bd.getSportCenters();
		GetSportCentersResponse sportCenters = new GetSportCentersResponse();
		for (Integer id_center : centers) {
			GetSportCenter c = new GetSportCenter();
			c.localId_sc = id_center;
			SportCenter center = getSportCenter(c).localSportCenter;
			sportCenters.addCenters(center);
		}
		return sportCenters;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getFields
	 * @return getFieldsResponse
	 */

	public org.example.www.sportcenterservice.GetFieldsResponse getFields(
			org.example.www.sportcenterservice.GetFields getFields) {
		BDConnector bd = new BDConnector();
		ArrayList<Field> fields = bd.getFields(getFields.localId_sc, getFields.localId_sport);
		GetFieldsResponse response = new GetFieldsResponse();
		for(Field f : fields)
			response.addFields(f);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getSports
	 * @return getSportsResponse
	 */

	public org.example.www.sportcenterservice.GetSportsResponse getSports(
			org.example.www.sportcenterservice.GetSports getSports) {
		
		BDConnector bd = new BDConnector();
		ArrayList<Sport> sports = bd.getSports(getSports.localId_sc);
		GetSportsResponse response = new GetSportsResponse();
		for(Sport s : sports)
			response.addSports(s);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getSportCenter
	 * @return getSportCenterResponse
	 */

	public org.example.www.sportcenterservice.GetSportCenterResponse getSportCenter(
			org.example.www.sportcenterservice.GetSportCenter getSportCenter) {
		BDConnector bd = new BDConnector();
		SportCenter center = bd.getSportCenter(getSportCenter.localId_sc);
		bd = new BDConnector();
		ArrayList<Sport> sp = bd.getSports(center.getId());
		for (Sport s : sp)
			center.addSports(s);
		GetSportCenterResponse sc = new GetSportCenterResponse();
		sc.localSportCenter = center;
		return sc;
	}

}
