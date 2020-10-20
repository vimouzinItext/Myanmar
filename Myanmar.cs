using iText.IO.Font;
using iText.Kernel.Font;
using iText.Kernel.Pdf;
using iText.Layout;
using iText.Layout.Element;
using iText.License;
using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1.iText
{
    class Myanmar
    {
        static String licensePath = "license.xml";
        static String outputPath = "outputPdf.pdf";
        static String pathToFontFile = "fontFile.ttf";

        public static void Main(String[] args)
        {
            LicenseKey.LoadLicenseFile(licensePath);
            PdfDocument pdfDocument = new PdfDocument(new PdfWriter(outputPath));
            Document document = new Document(pdfDocument);
            PdfFont font = PdfFontFactory.CreateFont(pathToFontFile, PdfEncodings.IDENTITY_H);
            document.SetFont(font);
            String text = " ြန်မာနိုင်ငံ 􀀀တရားဝင်အားဖြ င့် ပြ ည်ထော င်စု သမ္မတ မြ န်မာနိုင်ငံတော် 􀀀သည် အရှေ့ တော င်အာရှတွင် ဧရိယာ";
            document.Add(new Paragraph(text));
            document.Close();
        }
    }
}
