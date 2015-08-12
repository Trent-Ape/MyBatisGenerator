package org.mybatis.generator.my;

import java.io.File;

import org.mybatis.generator.api.ShellRunner;

/**
 * Mybatis自动生成mapper.xml,dao,model(使用官网Mybatis generator)
 * @author WuZhenquan
 * @date 2015年8月6日
 */
public class MyBatisGeneratorMain {
	
	/**
	 * 1、将generatorConfig.xml放在项目路径的src下（Maven项目默认放在src/main/resources下），并配置该xml文件
	 * 2、执行该generate方法即可生成对应的Dao,Model,Mapper.xml文件
	 * @param args
	 */
	public static void generate() {
		String[] args = new String[3];
		args[0] = "-configfile";
		String notMavenPath = "src/generatorConfig.xml";
		String mavenPath = "src/main/resources/generatorConfig.xml";
		File notMavenFile = new File(notMavenPath);
		
		args[1] = notMavenPath;
		if(!notMavenFile.exists()){
			args[1] = mavenPath;
		}
		
		args[2] = "-overwrite";
		ShellRunner.main(args);
	}
	
	/**
	 * 生成Dao,Model,Mapper.xml的方法
	 * @param configPath 配置文件generatorConfig.xml的路径（包含xml文件），例如src/generatorConfig.xml
	 */
	public static void generate(String configPath) {
		String[] args = new String[3];
		args[0] = "-configfile";
		args[1] = configPath;
		args[2] = "-overwrite";
		ShellRunner.main(args);
	}
	
	public static void main(String[] args) {
		generate();
	}
}
