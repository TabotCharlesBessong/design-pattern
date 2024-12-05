package strategy;

public class JpegCompressor implements Compressor {
  @Override
  public void compress(String fileName) {
    System.out.println("Compressing image using JPEG format");
  }
}
