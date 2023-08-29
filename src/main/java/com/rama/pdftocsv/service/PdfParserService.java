package com.rama.pdftocsv.service;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class PdfParserService {

    public void readPdf() throws IOException {
        File pdfFile = new File("jenius_mutasi.pdf");
        Loader.loadPDF(pdfFile);

    }
}
