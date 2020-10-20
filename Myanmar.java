package Myanmar;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.licensekey.LicenseKey;

import java.io.IOException;

public class Myanmar {

    static String licensePath ="license.xml";
    static String outputPath ="outputPdf.pdf";
    static String pathToFontFile = "fontFile.ttf";
    
    public static void main(String[] args) throws IOException {
        LicenseKey.loadLicenseFile(licensePath);
        PdfDocument pdfDocument = new PdfDocument(new PdfWriter(outputPath));
        Document document = new Document(pdfDocument);
        PdfFont font = PdfFontFactory.createFont(pathToFontFile, PdfEncodings.IDENTITY_H);
        document.setFont(font);
        String text =" ြန်မာနိုင်ငံ 􀀀တရားဝင်အားဖြ င့် ပြ ည်ထော င်စု သမ္မတ မြ န်မာနိုင်ငံတော် 􀀀သည် အရှေ့ တော င်အာရှတွင် ဧရိယာ";
        document.add(new Paragraph(text));
        document.close();
    }
}
