package com.test.pdfutil;
import java.io.IOException;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;
public class CompareTest {

	
	public static void main(String[] args) throws IOException{
		PDFUtil pdfUtil = new PDFUtil();
		String file1="D:/Users/dbhovi/Downloads/LIC.pdf";
		String file2="D:/Users/dbhovi/Downloads/LICNew.pdf";
		
		/*int cnt = pdfUtil.getPageCount("D:/Users/dbhovi/Downloads/Approved_Letter.pdf");
		System.out.println(cnt);*/
		
		
		/*boolean check=pdfUtil.compare(file1, file2);
		System.out.println(check);*/
		
		pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
		pdfUtil.highlightPdfDifference(true);
		pdfUtil.setImageDestinationPath("C:/Images");
		pdfUtil.compare(file1, file2);
	}
}
