package com.oracle.challenge;

import static org.junit.Assert.*;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.junit.Test;

public class BoxSolverTest {

	private static final Logger LOG = Logger.getLogger(BoxSolverTest.class.getName());

	@Test
	public void test() {
		String firstProblem = "##########\n b B #\n# @ #\n A a #\n# #\n##########";
		String solution = BoxSolver.solve(firstProblem);
		LOG.info(solution);
	}
	
	@Test
	public void test2() {
		String firstProblem = 
				  "##########\n"
				+ "# b    B #\n"
				+ "#   @    #\n"
				+ "# a    A #\n"
				+ "#        #\n"
				+ "##########";
		String expected = "llldrrrrrurrulllll";
		String solution = BoxSolver.solve(firstProblem);
		LOG.info(solution);

	}

}
