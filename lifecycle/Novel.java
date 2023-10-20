package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Novel implements InitializingBean,DisposableBean{
		private double price;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			System.out.println("Setting Novel Price");
			this.price = price;
		}

		public Novel() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "novel [Purchasing price of Novel =" + price + "]";
		}
		/*
		public void init() {
			System.out.println("Inside init Method Novel");
		}
		public void destroy() {
			System.out.println("Inside destroy Method Novel");
		}
		*/

		@Override
		public void afterPropertiesSet() throws Exception {
			// init 
			System.out.println("Going to Read the Novel from the library");
			
		}

		@Override
		public void destroy() throws Exception {
			// destroy
			System.out.println("I had read the Novel & Putting back to the library");
			
		}
}
