package com;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Square extends TagSupport {
	
		int number;
		
		
		public int getNumber() {
			return number;
		}


		public void setNumber(int number) {
			this.number = number;
		}


		@Override
		public int doStartTag() throws JspException {
			
			
			 try {
		            int square = number * number;
		            JspWriter out = pageContext.getOut();
		            out.print(square);
		        } catch (IOException e) {
		            throw new JspException("Error in SquareTag", e);
		        }
		        return SKIP_BODY;
		}
}
