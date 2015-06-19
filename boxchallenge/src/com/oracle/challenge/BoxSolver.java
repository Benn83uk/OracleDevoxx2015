package com.oracle.challenge;

import java.util.logging.Logger;

public class BoxSolver {
	private static final Logger LOG = Logger.getLogger(BoxSolverTest.class.getName());
	private static final String player = "@";
	private static final String wall = "#";
	private static final String boxRegex = "[a-zA-Z]";
	
	public static String solve(String problem) {
		//Problem string contains a-z, A-Z, @, #, space and \n
		//First sample is ##########\n b B #\n# @ #\n A a #\n# #\n##########
		//output problem
		LOG.info("Problem:\n" + problem);
		
		String solution = "";
		//move boxes
		
		
		//return
		return solution;
	}
}
