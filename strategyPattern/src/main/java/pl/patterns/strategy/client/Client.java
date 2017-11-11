package pl.patterns.strategy.client;

import pl.patterns.strategy.context.CompressionContext;
import pl.patterns.strategy.domain.File;
import pl.patterns.strategy.strategy.impl.JarCompressionStrategy;
import pl.patterns.strategy.strategy.impl.RarCompressionStrategy;
import pl.patterns.strategy.strategy.impl.ZipCompressionStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        CompressionContext ctx = new CompressionContext();
        List<File> fileList = new ArrayList<File>();

        ctx.setCompressionStrategy(new JarCompressionStrategy());
        ctx.createArchive(fileList);

        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        ctx.createArchive(fileList);

        ctx.setCompressionStrategy(new RarCompressionStrategy());
        ctx.createArchive(fileList);
    }
}
