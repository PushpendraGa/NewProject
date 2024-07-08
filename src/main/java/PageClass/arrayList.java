package PageClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class arrayList {

	public static <E> void main(String[] args) {

		ArrayList cars = new ArrayList();

		
		cars.add(1);
		cars.add(90);
		cars.add(2);
		cars.add(3);
		cars.add(4);
		cars.add(5);
		cars.add(6);
		
		
    
			System.out.println(cars);
    		Collections.sort(cars);
    		
    		System.out.println(cars);
		
	
			 
			int nummix = (int) Collections.min(cars);
			int nummin = (int) Collections.max(cars);
			System.out.println(nummix);
			System.out.println(nummin);
		}
	}


