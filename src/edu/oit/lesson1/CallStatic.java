package edu.oit.lesson1;

import java.io.*;
import java.awt.*;

/**
 * @author Joshua
 *
 */
public class CallStatic {
	public static void callMe() {
		System.out
				.print("this is a static function-------I belong the class (CallStatic) who is called by the class (HelloWorld) "
						+ "\r\n");
	}

	public void callHim() {
		System.out.print(
				"this is a non static function---I also belong the class (CallStatic) who is called by the class (HelloWorld) ");
	}

}
