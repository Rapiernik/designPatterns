package pl.patterns.strategy.strategy.impl;

import pl.patterns.strategy.domain.File;
import pl.patterns.strategy.strategy.CompressionStrategy;

import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy {

    public void compressFiles(List<File> files) {
        //using ZIP approach
        System.out.println("compressing to ZIP files...");
    }
}
