package com.sahay.tutorial.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //means अर्थात अगर इस बीन को अलग अलग कॉम्पोनेन्ट में इंजेक्ट किया जाया या डिफरेंट डिफरेंट बार कॉल किया जाये तो हर बार नई बीन instance क्रिएट होगा 
public class ScopeTutorial {
	private static int num=0;
	public ScopeTutorial() {
		num++;
		System.out.println("My Bean Created"+" "+num);
	}

	public void protoDemo() {
		System.out.println("Demo");
	}
}
