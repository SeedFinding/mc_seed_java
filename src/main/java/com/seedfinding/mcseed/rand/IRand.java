package com.seedfinding.mcseed.rand;

public interface IRand {
	int nextInt();

	int nextInt(int bound);

	boolean nextBoolean();

	float nextFloat();

	long nextLong();

	double nextDouble();

	double nextGaussian();
}
