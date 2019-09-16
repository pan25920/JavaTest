package Test;

public class Personnel_DB{
	public static void main(String [] args){
		System.out.println("\t\t* * * * * * 人事管理 * * * * * *");
		int ary [] [] = new int [20] [3];//用户名
		ary[0][0]=14030416;
		ary[0][1]=25920;
		int count=1;
		int aryy [] [] = new int [20] [2];//部门管理
		int counter=0;
		int staffary [] [] =new int [20] [5];//员工管理
		int stafcount=0;
		int salary [] [] = new int [20] [4];//工资管理
		int money=0;
		while (true)
		{
			System.out.println("1.登录   2.注册   3.退出");
			int select=Lxit.getInt();
			if (select==1)
			{
				System.out.println("请输入用户名：");
				int importuser=Lxit.getInt();
				System.out.println("请输入密码：");
				int importpassword=Lxit.getInt();
				int indexuser=-1;
				for (int i=0;i<count ;i++ )
				{
					if (ary[i][0]==importuser&&ary[i][1]==importpassword)
					{
						indexuser=i;
						break;
					}
				}
				if (indexuser!=-1)
				{
					if (ary[indexuser][2]==1)//人事
					{
						while (true)
						{
							System.out.println("1.员工管理   2.工资录入   3.注销");
							int optionyi=Lxit.getInt();
							if (optionyi==1)//人事/员工管理
							{
								while (true)
								{
									System.out.println("1.增加员工   2.查询员工   3.删除员工   4.修改员工   5.返回上一级");
									int optinoyione=Lxit.getInt();
									if (optinoyione==1)
									{
										System.out.println("请输入部门：");
										int pullsection=Lxit.getInt();
										int indexpullset=-1;
										for (int i=0;i<counter ;i++ )
										{
											if (aryy[i][1]==pullsection)
											{
												indexpullset=i;
												break;
											}
										}
										if (indexpullset!=-1)
										{
											staffary[stafcount][0]=aryy[indexpullset][1];
											System.out.println("请添加编号：");
											int addnumber=Lxit.getInt();
											int indexaddnb=-1;
											for (int i=0;i<stafcount ;i++ )
											{
												if (staffary[i][1]==addnumber)
												{
													indexaddnb=i;
													break;
												}
											}
											if (indexaddnb==-1)
											{
												staffary[stafcount][1]=addnumber;
												System.out.println("请添加姓名：");
												int addname=Lxit.getInt();
												staffary[stafcount][2]=addname;
												System.out.println("请添加性别：");
												int addsex=Lxit.getInt();
												staffary[stafcount][3]=addsex;
												System.out.println("请添加年龄：");
												int addage=Lxit.getInt();
												staffary[stafcount][4]=addage;
												System.out.println("增加员工完成！");
												stafcount++;
											}else{
												System.out.println("编号已存在！");
											}
										}else{
											System.out.println("您输入的部门不存在！");
										}
									}
									else if (optinoyione==2)
									{
										System.out.println("部门\t编号\t姓名\t性别\t年龄");
										for (int i=0;i<stafcount ;i++ )
										{
											System.out.println(staffary[i][0]+"\t"+staffary[i][1]+"\t"+staffary[i][2]+"\t"+staffary[i][3]+"\t"+staffary[i][4]);
										}
									}
									else if (optinoyione==3)
									{
										System.out.println("请输入员工的编号：");
										int delenumber=Lxit.getInt();
										int indexdelenb=-1;
										for (int i=0;i<stafcount ;i++ )
										{
											if (staffary[i][1]==delenumber)
											{
												indexdelenb=i;
												break;
											}
										}
										if (indexdelenb!=-1)
										{
											for (int i=indexdelenb;i<stafcount-1 ;i++ )
											{
												for (int j=0;j<staffary[i].length ;j++ )
												{
													staffary[i][j]=staffary[i+1][j];
												}
											}
											System.out.println("删除成功！");
											stafcount--;
										}else{
											System.out.println("员工不存在！");
										}
									}
									else if (optinoyione==4)
									{
										System.out.println("请输入要修改的员工编号：");
										int alterstaff=Lxit.getInt();
										int indexaltersf=-1;
										for (int i=0;i<stafcount ;i++ )
										{
											if (staffary[i][1]==alterstaff)
											{
												indexaltersf=i;
												break;
											}
										}
										if (indexaltersf!=-1)
										{
											System.out.println("请输入新的编号：");
											int newnumber=Lxit.getInt();
											int indexnewnb=-1;
											for (int i=0;i<stafcount ;i++ )
											{
												if (staffary[i][1]==newnumber)
												{
													indexnewnb=i;
													break;
												}
											}
											if (indexnewnb==-1)
											{
												staffary[indexaltersf][1]=newnumber;
												System.out.println("请输入新的姓名：");
												int newname=Lxit.getInt();
												staffary[indexaltersf][2]=newname;
												System.out.println("请输入新的性别：");
												int newsex=Lxit.getInt();
												staffary[indexaltersf][3]=newsex;
												System.out.println("请输入新的年龄：");
												int newage=Lxit.getInt();
												staffary[indexaltersf][4]=newage;
												System.out.println("修改员工完毕！");
											}else{
												System.out.println("您输入的编号已存在！");
											}
										}else{
											System.out.println("您要修改的员工不存在！");
										}
									}
									else if (optinoyione==5)
									{
										System.out.println("已返回上一级！");
										break;
									}
									else {
										System.out.println("按键错误！");
									}
								}
							}
							else if (optionyi==2)//人事/工资录入
							{
								while (true)
								{
									System.out.println("1.增加工资   2.查询工资   3.删除工资   4.修改工资   5.返回上一级");
									int optionyitwo=Lxit.getInt();
									if (optionyitwo==1)
									{
										System.out.println("请输入员工编号：");
										int bianhao=Lxit.getInt();
										int indexbh=-1;
										for (int i=0;i<stafcount ;i++ )
										{
											if (staffary[i][1]==bianhao)
											{
												indexbh=i;
												break;
											}
										}
										if (indexbh!=-1)
										{

											salary[money][0]=staffary[indexbh][1];
											System.out.println("请输入此员工的底薪工资：");
											int addmoney=Lxit.getInt();
											salary[money][1]=addmoney;
											System.out.println("请输入此员工的奖金：");
											int addbonus=Lxit.getInt();
											salary[money][2]=addbonus;
											int a=0;
											a=addmoney+addbonus;
											salary[money][3]=a;//总工资
											money++;
										}else{
											System.out.println("编号员工不存在！");
										}
									}
									else if (optionyitwo==2)
									{
										System.out.println("编号    底薪工资    奖金    总工资");
										for (int i=0;i<money ;i++ )
										{
											System.out.println(salary[i][0]+"\t   "+salary[i][1]+"\t   "+salary[i][2]+"\t   "+salary[i][3]);
										}
										System.out.println("查询工资完成！");
									}
									else if (optionyitwo==3)//删除工资！
									{
										System.out.println("请输入编号：");
										int delemoneyn=Lxit.getInt();
										int indexdlmnb=-1;
										for (int i=0;i<stafcount ;i++ )
										{
											if (staffary[i][1]==delemoneyn)
											{
												indexdlmnb=i;
												break;
											}
										}
										if (indexdlmnb!=-1)
										{
											salary[indexdlmnb][1]=0;
											salary[indexdlmnb][2]=0;
											salary[indexdlmnb][3]=0;
											System.out.println("删除成功！");
										}else{
											System.out.println("编号不存在！");
										}
									}
									else if (optionyitwo==4)
									{
										System.out.println("请输入编号：");
										int srbianhao=Lxit.getInt();
										int srbh=-1;
										for (int i=0;i<stafcount ;i++ )
										{
											if (staffary[i][1]==srbianhao)
											{
												srbh=i;
												break;
											}
										}
										if (srbh!=-1)
										{
											System.out.println("请输入新的底薪工资:");
											int newmoney=Lxit.getInt();
											salary[srbh][1]=newmoney;
											System.out.println("请输入新的奖金：");
											int newbonus=Lxit.getInt();
											salary[srbh][2]=newbonus;
											int b=0;
											b=newmoney+newbonus;
											salary[srbh][3]=b;
											System.out.println("修改完成！");
										}else{
											System.out.println("您输入员工编号不存在！");
										}
									}
									else if (optionyitwo==5)
									{
										System.out.println("已返回上一级！");
										break;
									}
									else {
										System.out.println("按键错误！");
									}
								}
							}
							else if (optionyi==3)
							{
								System.out.println("已返回上一级");
								break;
							}
							else {
								System.out.println("按键错误！");
							}
						}
					}
					else if (ary[indexuser][2]==2)//普工
					{
						System.out.println("请输入您的编号：");
						int bianhao=Lxit.getInt();
						int indexsix=-1;
						for (int i=0;i<stafcount ;i++ )
						{
							if (staffary[i][1]==bianhao)
							{
								indexsix=i;
								break;
							}
						}
						if (indexsix!=-1)
						{
							System.out.println("部门\t底薪工资\t奖金\t总工资");
							for (int i=0;i<money ;i++ )
							{
								System.out.println(salary[i][0]+"\t  "+salary[i][1]+"\t  "+salary[i][2]+"\t  "+salary[i][3]);
							}
						}else{
							System.out.println("您输入的编号不存在！");
						}
					}
					else {//管理员
						while (true)//管理员
						{
							System.out.println("1.用户管理   2.部门管理   3.注销");
							int option=Lxit.getInt();
							if (option==1)//管理员/用户管理
							{
								while (true)
								{
									System.out.println("1.增加用户   2.查询用户   3.删除用户   4.修改用户   5.返回上一级");
									int optionone=Lxit.getInt();
									if (optionone==1)//管理员/用户管理/增加用户
									{
										System.out.println("请输入要增加的用户名：");
										int adduser=Lxit.getInt();
										int indexadduser=-1;
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]==adduser)
											{
												indexadduser=i;
												break;
											}
										}
										if (indexadduser==-1)
										{
											ary[count][0]=adduser;
											System.out.println("请输入增加的用户名密码：");
											int adduserpassword=Lxit.getInt();
											ary[count][1]=adduserpassword;
											System.out.println("请选择身份：");
											System.out.println("1.人事  2.普工");
											int identity=Lxit.getInt();
											ary[count][2]=identity;
											count++;
											System.out.println("注册完成！");
										}else{
											System.out.println("用户名已存在！");
										}
									}
									else if (optionone==2)//管理员/用户管理/查询用户
									{
										System.out.println("用户\t密码\t身份");
										int index=-1;
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]!=ary[0][0])
											{
												index=i;
												System.out.println(ary[i][0]+"\t"+ary[i][1]+"\t"+ary[i][2]);
											}
										}
										if (index!=-1)
										{
											System.out.println("查询用户成功！");
										}else{
											System.out.println("无用户！！！请增加");
										}
									}
									else if (optionone==3)//管理员/用户管理/删除用户
									{
										System.out.println("请输入要删除的用户名：");
										int deleusername=Lxit.getInt();
										int indexdele=-1;
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]==deleusername)//判断要删除的用户身份存在
											{
												indexdele=i;
											}
										}
										if (indexdele!=-1)//存在！
										{

											for (int i=indexdele;i<count-1 ;i++ )
											{
												for (int j=0;j<ary[i].length ;j++ )
												{
													ary[i][j]=ary[i+1][j];//移位删除
												}
											}
											count--;//删一个计算器减一个
											
											System.out.println("删除成功！");
										}else{
												if (deleusername==ary[0][0])//当删除的用户为默认的字符时  提示一下
												{
													System.out.println("不能删除管理员用户！");
												}else{//不存在！
													System.out.println("您要删除的用户名不存在！");
											}
										}
									}
									else if (optionone==4)//管理员/用户管理/修改用户
									{
										System.out.println("请输入要修改的用户名：");
										int amendusername=Lxit.getInt();
										int indexamend=-1;
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]==amendusername)//判断存不存在！
											{
												indexamend=i;
												break;
											}
										}
										if (indexamend!=-1)//存在
										{
											while (true)
											{
												System.out.println("请输入新的用户名：");
												int newusername=Lxit.getInt();
												int indexnewname=-1;
												for (int i=0;i<count ;i++ )
												{
													if (ary[i][0]==newusername)//判断新的用户名是否重复！
													{
														indexnewname=i;
														break;
													}
												}
												if (indexnewname==-1)//不重复！
												{
													ary[indexamend][0]=newusername;//赋给要修改的那一行的用户名下标
													System.out.println("请输入新的密码：");
													int newpassword=Lxit.getInt();
													ary[indexamend][1]=newpassword;//~~~密码下标
													System.out.println("请输入新的身份：");
													int newidentity=Lxit.getInt();
													if (newidentity>0&&newidentity<3)
													{
														ary[indexamend][2]=newidentity;
													}else{
														System.out.println("身份未修改成功！");
													}
													//~~~身份下标
													System.out.println("修改成功！");
													break;
												}else{//重复！
													System.out.println("您输入的新用户名已存在！");
												}
											}
										}else{//不存在！
											System.out.println("您要修改的用户名不存在！");
										}
									}
									else if (optionone==5)
									{
										System.out.println("已返回上一级！");
										break;
									}
									else {
										System.out.println("按键错误！");
									}
								}
							}
							else if (option==2)//管理员/部门管理
							{
								while (true)
								{
									System.out.println("1.增加部门   2.查询部门   3.删除部门   4.修改部门   5.返回上一级");
									int optiontwo=Lxit.getInt();
									if (optiontwo==1)
									{
										System.out.println("请输入增加到的用户名：");
										int leaduser=Lxit.getInt();
										int indexlead=-1;
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]==leaduser)
											{
												indexlead=i;
												break;
											}
										}
										if (indexlead!=-1)
										{
											aryy[counter][0]=ary[indexlead][0];
											System.out.println("请输入要增加的部门：");
											int adddepartment=Lxit.getInt();
											int indexdepar=-1;
											for (int i=0;i<counter ;i++ )
											{
												if (aryy[i][1]==adddepartment&&aryy[i][0]==leaduser)
												{
													indexdepar=i;
													break;
												}
											}
											if (indexdepar==-1)
											{
												aryy[counter][1]=adddepartment;
												counter++;
											}else{
												System.out.println("部门已存在！");
											}
										}else{
											System.out.println("您输入的用户名不存在！");
										}
									}
									else if (optiontwo==2)
									{
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]!=ary[0][0])
											{
												System.out.println("用户名："+ary[i][0]);
												for (int j=0;j<counter ;j++ )
												{
													if (aryy[j][0]==ary[i][0])
													{
														System.out.println("\t部门："+aryy[j][1]);
													}
												}
											}
										}
										
									}
									else if (optiontwo==3)
									{
										System.out.println("请输入您要删除的部门：");
										int deledepartment=Lxit.getInt();
										int indexdelepar=-1;
										for (int i=0;i<counter ;i++ )
										{
											if (aryy[i][1]==deledepartment)
											{
												indexdelepar=i;
												break;
											}
										}
										if (indexdelepar!=-1)
										{
											for (int i=indexdelepar;i<counter-1 ;i++ )
											{
												aryy[i][1]=aryy[i+1][1];
											}
											System.out.println("删除成功！");
											counter--;
										}else{
											System.out.println("您输入的部门不存在！");
										}
									}
									else if (optiontwo==4)
									{
										System.out.println("请输入要修改的部门：");
										int altersection=Lxit.getInt();
										int indexalt=-1;
										for (int i=0;i<counter ;i++ )
										{
											if (aryy[i][1]==altersection)
											{
												indexalt=i;
												break;
											}
										}
										if (indexalt!=-1)
										{
											System.out.println("请输入新的部门：");
											int newsection=Lxit.getInt();
											int indexnewsct=-1;
											for (int i=0;i<counter ;i++ )
											{
												if (aryy[i][1]==newsection)
												{
													indexnewsct=i;
													break;
												}
											}
											if (indexnewsct==-1)
											{
												aryy[indexalt][1]=newsection;
												System.out.println("修改成功！");
											}else{
												System.out.println("部门已存在！");
											}
										}else{
											System.out.println("您输入的部门不存在！");
										}
									}
									else if (optiontwo==5)
									{
										System.out.println("已返回上一级");
										break;
									}
									else {
										System.out.println("按键错误！");
									}
								}
								
							}
							else if (option==3)
							{
								System.out.println("已返回上一级！");
								break;
							}
							else {
								System.out.println("按键错误！");
							}
						}
					}
				}else{
					int indexpanduan=-1;
					for (int i=0;i<count ;i++ )
					{
						if (ary[i][0]==importuser)
						{
							indexpanduan=i;
							break;
						}
					}
					if (indexpanduan==-1)
					{
						System.out.println("用户名不存在！");
					}else{
						System.out.println("密码错误！");
					}
				}
			}
			else if (select==2)
			{
				System.out.println("请输入要增加的用户名：");
				int adduser=Lxit.getInt();
				int indexadduser=-1;
				for (int i=0;i<count ;i++ )
				{
					if (ary[i][0]==adduser)
					{
						indexadduser=i;
						break;
					}
				}
				if (indexadduser==-1)
				{
					ary[count][0]=adduser;
					System.out.println("请输入增加的用户名密码：");
					int adduserpassword=Lxit.getInt();
					ary[count][1]=adduserpassword;
					System.out.println("请选择身份：");
					System.out.println("1.人事  2.普工");
					int identity=Lxit.getInt();
					ary[count][2]=identity;
					count++;
					System.out.println("注册完成！");
				}else{
					System.out.println("用户名已存在！");
				}
			}
			else if (select==3)
			{
				System.out.println("已退出系统！");
				System.out.println("2017/9/28完成");
				break;
			}
			else {
				System.out.println("按键错误！");
			}
		}
	}
}