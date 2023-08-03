package com.xworkz.casting.brand.boot;

import com.xworkz.casting.brand.app.Brand;
import com.xworkz.casting.brand.app.BrandUtil;
import com.xworkz.casting.brand.app.DuplicateBrand;
import com.xworkz.casting.brand.app.InternationalBrand;
import com.xworkz.casting.brand.app.LocalBrand;
import com.xworkz.casting.brand.app.NationalBrand;

public class BrandRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Running main in BrandRunner");
		
		Brand brand=new Brand();
		LocalBrand loacBrand=new LocalBrand();
		DuplicateBrand duplicateBrand=new DuplicateBrand();
		InternationalBrand internationalBrand=new InternationalBrand();
		NationalBrand nationalBrand=new NationalBrand();
		
		BrandUtil.run(nationalBrand);
		BrandUtil.run(loacBrand);
		BrandUtil.run(internationalBrand);
		BrandUtil.run(duplicateBrand);
		

	}

}
