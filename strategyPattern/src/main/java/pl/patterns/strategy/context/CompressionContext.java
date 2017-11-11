package pl.patterns.strategy.context;

import pl.patterns.strategy.domain.File;
import pl.patterns.strategy.strategy.CompressionStrategy;

import java.util.List;

public class CompressionContext {

    private CompressionStrategy strategy;

    //this can be set at runtime by the application preferences
    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    //use the strategy
    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }
}
