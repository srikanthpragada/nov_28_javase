package io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class File2Demo {

	static class ProcessFile extends SimpleFileVisitor<Path> {
		public void printFile(Path file) {
			// print contents of file
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			if (file.toString().endsWith(".java"))
				printFile(file);

			return FileVisitResult.CONTINUE;
		}

	}

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("f:\\classroom\\nov28");

		Files.walkFileTree(p, new ProcessFile());

	}

}
