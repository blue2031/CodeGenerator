package codeGenerate;

import codeGenerate.def.FtlDef;
import codeGenerate.factory.CodeGenerateFactory;

public class CodeUtil {
	
	public static void main(String[] args) {
	
		/** 此处修改成你的 表名 和 中文注释 ***/
		String[] tableNames = {"jeecg_note","jeecg_person"};
		for(String tableName:tableNames){
			String codeName = "测试";// 中文注释 当然你用英文也是可以的
			String entityPackage = "person";// 实体包
			String keyType = FtlDef.KEY_TYPE_02;// 主键生成方式 01:UUID 02:自增
			CodeGenerateFactory.codeGenerate(tableName, codeName, entityPackage, keyType, "pages",false);
		}
	}
}