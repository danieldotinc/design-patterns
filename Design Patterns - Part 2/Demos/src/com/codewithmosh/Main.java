package com.codewithmosh;

import com.codewithmosh.decorator.CloudStream;
import com.codewithmosh.decorator.CompressedCloudStream;
import com.codewithmosh.decorator.EncryptedCloudStream;
import com.codewithmosh.decorator.Stream;

public class Main {
    public static void main(String[] args) {
        Stream cloudStream = new CompressedCloudStream(new EncryptedCloudStream(new CloudStream()));
        cloudStream.write("Daniel");
    }
}