package org.dimigo.io;

import java.io.FileOutputStream;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.URL; 

/**
 * <pre>
 * org.dimigo.io
 * 	|_ SaveImageFromUrl
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 28.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */

public class SaveImageFromUrl {  
		 public static void main(String[] args) throws Exception{  
		 		try{  
		 			String imageUrl = "http://moviepre.mprd.co.kr/@upload/movie/2015/06/26/2015062616261840553.jpg";  
		 			URL url = new URL(imageUrl);  
		 			  
		 			InputStream is = url.openStream();  
		 			OutputStream os = new FileOutputStream("files/logo.png");  
		 			  
		 		} catch (Exception e){  
		 			e.printStackTrace();  
		 		}  
		 	}  
		 }  

