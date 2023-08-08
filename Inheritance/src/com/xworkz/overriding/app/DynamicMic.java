package com.xworkz.overriding.app;

public class DynamicMic extends Mic{
@Override
public void sound() {
	System.out.println("Invoking sound in DynamicMic");
}
}
