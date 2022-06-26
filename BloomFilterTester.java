// Bloom Filter using Guava Library

import java.nio.charset.Charset;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class BloomFilterTester {

	public static void main(String[] args)
	{

		// Create a Bloom Filter instance
		BloomFilter<String> blackListedIps
				= BloomFilter.create(
				Funnels.stringFunnel(
						Charset.forName("UTF-8")),
				10000);

		// Add the data sets
		blackListedIps.put("192.112.0.1");
		blackListedIps.put("192.112.0.2");
		blackListedIps.put("192.112.0.3");

		// Test the bloom filter
		System.out.println(
				blackListedIps
						.mightContain(
								"192.112.0.1"));
		System.out.println(
				blackListedIps
						.mightContain(
								"175.112.0.2"));
	}

}
