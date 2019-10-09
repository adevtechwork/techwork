package com.kp.idm.okta.envutility.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class EnvironmentUtil {
	private EnvironmentUtil() {
	}

	// Utility to check input json validity

	public static boolean isJSONValid(String jsonInString) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			mapper.readTree(jsonInString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isValidJSON(String test) {
		try {
			new JSONObject(test);
		} catch (JSONException ex) {

			try {
				new JSONArray(test);
			} catch (JSONException ex1) {
				return false;
			}
		}
		return true;
	}

	// utility to check if any key token is missing in env. json finally.
	public static List<String> extractTokens(String txt, String str, String end) {
		int i = 0;
		int j;
		List<String> lst = new ArrayList<String>();

		while (i < txt.length() && (i = txt.indexOf(str, i)) != -1) {
			i += str.length();
			if (i < txt.length() && (j = txt.indexOf(end, i)) != -1) {
				lst.add(txt.substring(i, j));
				i = j + end.length();
			}
		}
		return lst;
	}

}
