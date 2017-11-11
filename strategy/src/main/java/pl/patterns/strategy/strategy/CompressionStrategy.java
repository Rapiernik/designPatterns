package pl.patterns.strategy.strategy;

import pl.patterns.strategy.domain.File;

import java.util.List;

public interface CompressionStrategy {
    void compressFiles(List<File> files);
}
