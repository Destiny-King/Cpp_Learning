package com.wym.rominmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wym.rominmall.product.entity.BrandEntity;
import com.wym.rominmall.product.service.BrandService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RominmallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();

//		brandEntity.setName("华为");
//		brandService.save(brandEntity);
//		System.out.println("保存成功...");

//		brandEntity.setBrandId(6L);
//		brandEntity.setDescript("华为");
//		brandService.updateById(brandEntity);
//		System.out.println("修改成功...");

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 6L));
		list.forEach((item) -> {
			System.out.println(item);
		});
	}

}
