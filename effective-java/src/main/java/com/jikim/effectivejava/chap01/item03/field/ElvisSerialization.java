package com.jikim.effectivejava.chap01.item03.field;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ElvisSerialization {

	public static void main(String[] args) {
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
			out.writeObject(Elvis.INSTANCE);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
			Elvis elvis3 = (Elvis) in.readObject();
			System.out.println(elvis3 == Elvis.INSTANCE);
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
