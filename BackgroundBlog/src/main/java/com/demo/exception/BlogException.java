package com.demo.exception;

public class BlogException extends Exception {

		//异常信息
		private String message;
		
		public BlogException(String message){
			super(message);
			this.message = message;
			
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

}
