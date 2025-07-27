package com.problems.Leetcode;

import java.util.Arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(heights.length);
		int n=heights.length;
		int[] lmax=new int[heights.length];
		int[] rmax=new int[heights.length];
		for(int i=0;i<n;i++) {
			int rm=0;
			for(int j=i+1;j<n;j++) {
				if(heights[j]>rm) {
					rm=heights[j];
				}
			}
			rmax[i]=rm;
		}
		System.out.println(Arrays.toString(rmax));
		
		for(int i=n-1;i>=0;i--) {
			int lm=0;
			for(int j=i-1;j>=0;j--) {
				if(heights[j]>lm) {
					lm=heights[j];
				}
			}
			lmax[i]=lm;
		}
		System.out.println(Arrays.toString(lmax));
		int total_trapped_water=0;
		
		for(int i=0;i<n;i++) {
			int pot=Math.min(lmax[i],rmax[i]);
			int wat=pot-heights[i];
			if(wat>0) {
				total_trapped_water+=wat;
			}
				
			
			
		}
		System.out.println(total_trapped_water);
		
	}

}
