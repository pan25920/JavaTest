package Test;

public class Personnel_DB{
	public static void main(String [] args){
		System.out.println("\t\t* * * * * * ���¹��� * * * * * *");
		int ary [] [] = new int [20] [3];//�û���
		ary[0][0]=14030416;
		ary[0][1]=25920;
		int count=1;
		int aryy [] [] = new int [20] [2];//���Ź���
		int counter=0;
		int staffary [] [] =new int [20] [5];//Ա������
		int stafcount=0;
		int salary [] [] = new int [20] [4];//���ʹ���
		int money=0;
		while (true)
		{
			System.out.println("1.��¼   2.ע��   3.�˳�");
			int select=Lxit.getInt();
			if (select==1)
			{
				System.out.println("�������û�����");
				int importuser=Lxit.getInt();
				System.out.println("���������룺");
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
					if (ary[indexuser][2]==1)//����
					{
						while (true)
						{
							System.out.println("1.Ա������   2.����¼��   3.ע��");
							int optionyi=Lxit.getInt();
							if (optionyi==1)//����/Ա������
							{
								while (true)
								{
									System.out.println("1.����Ա��   2.��ѯԱ��   3.ɾ��Ա��   4.�޸�Ա��   5.������һ��");
									int optinoyione=Lxit.getInt();
									if (optinoyione==1)
									{
										System.out.println("�����벿�ţ�");
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
											System.out.println("����ӱ�ţ�");
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
												System.out.println("�����������");
												int addname=Lxit.getInt();
												staffary[stafcount][2]=addname;
												System.out.println("������Ա�");
												int addsex=Lxit.getInt();
												staffary[stafcount][3]=addsex;
												System.out.println("��������䣺");
												int addage=Lxit.getInt();
												staffary[stafcount][4]=addage;
												System.out.println("����Ա����ɣ�");
												stafcount++;
											}else{
												System.out.println("����Ѵ��ڣ�");
											}
										}else{
											System.out.println("������Ĳ��Ų����ڣ�");
										}
									}
									else if (optinoyione==2)
									{
										System.out.println("����\t���\t����\t�Ա�\t����");
										for (int i=0;i<stafcount ;i++ )
										{
											System.out.println(staffary[i][0]+"\t"+staffary[i][1]+"\t"+staffary[i][2]+"\t"+staffary[i][3]+"\t"+staffary[i][4]);
										}
									}
									else if (optinoyione==3)
									{
										System.out.println("������Ա���ı�ţ�");
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
											System.out.println("ɾ���ɹ���");
											stafcount--;
										}else{
											System.out.println("Ա�������ڣ�");
										}
									}
									else if (optinoyione==4)
									{
										System.out.println("������Ҫ�޸ĵ�Ա����ţ�");
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
											System.out.println("�������µı�ţ�");
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
												System.out.println("�������µ�������");
												int newname=Lxit.getInt();
												staffary[indexaltersf][2]=newname;
												System.out.println("�������µ��Ա�");
												int newsex=Lxit.getInt();
												staffary[indexaltersf][3]=newsex;
												System.out.println("�������µ����䣺");
												int newage=Lxit.getInt();
												staffary[indexaltersf][4]=newage;
												System.out.println("�޸�Ա����ϣ�");
											}else{
												System.out.println("������ı���Ѵ��ڣ�");
											}
										}else{
											System.out.println("��Ҫ�޸ĵ�Ա�������ڣ�");
										}
									}
									else if (optinoyione==5)
									{
										System.out.println("�ѷ�����һ����");
										break;
									}
									else {
										System.out.println("��������");
									}
								}
							}
							else if (optionyi==2)//����/����¼��
							{
								while (true)
								{
									System.out.println("1.���ӹ���   2.��ѯ����   3.ɾ������   4.�޸Ĺ���   5.������һ��");
									int optionyitwo=Lxit.getInt();
									if (optionyitwo==1)
									{
										System.out.println("������Ա����ţ�");
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
											System.out.println("�������Ա���ĵ�н���ʣ�");
											int addmoney=Lxit.getInt();
											salary[money][1]=addmoney;
											System.out.println("�������Ա���Ľ���");
											int addbonus=Lxit.getInt();
											salary[money][2]=addbonus;
											int a=0;
											a=addmoney+addbonus;
											salary[money][3]=a;//�ܹ���
											money++;
										}else{
											System.out.println("���Ա�������ڣ�");
										}
									}
									else if (optionyitwo==2)
									{
										System.out.println("���    ��н����    ����    �ܹ���");
										for (int i=0;i<money ;i++ )
										{
											System.out.println(salary[i][0]+"\t   "+salary[i][1]+"\t   "+salary[i][2]+"\t   "+salary[i][3]);
										}
										System.out.println("��ѯ������ɣ�");
									}
									else if (optionyitwo==3)//ɾ�����ʣ�
									{
										System.out.println("�������ţ�");
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
											System.out.println("ɾ���ɹ���");
										}else{
											System.out.println("��Ų����ڣ�");
										}
									}
									else if (optionyitwo==4)
									{
										System.out.println("�������ţ�");
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
											System.out.println("�������µĵ�н����:");
											int newmoney=Lxit.getInt();
											salary[srbh][1]=newmoney;
											System.out.println("�������µĽ���");
											int newbonus=Lxit.getInt();
											salary[srbh][2]=newbonus;
											int b=0;
											b=newmoney+newbonus;
											salary[srbh][3]=b;
											System.out.println("�޸���ɣ�");
										}else{
											System.out.println("������Ա����Ų����ڣ�");
										}
									}
									else if (optionyitwo==5)
									{
										System.out.println("�ѷ�����һ����");
										break;
									}
									else {
										System.out.println("��������");
									}
								}
							}
							else if (optionyi==3)
							{
								System.out.println("�ѷ�����һ��");
								break;
							}
							else {
								System.out.println("��������");
							}
						}
					}
					else if (ary[indexuser][2]==2)//�չ�
					{
						System.out.println("���������ı�ţ�");
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
							System.out.println("����\t��н����\t����\t�ܹ���");
							for (int i=0;i<money ;i++ )
							{
								System.out.println(salary[i][0]+"\t  "+salary[i][1]+"\t  "+salary[i][2]+"\t  "+salary[i][3]);
							}
						}else{
							System.out.println("������ı�Ų����ڣ�");
						}
					}
					else {//����Ա
						while (true)//����Ա
						{
							System.out.println("1.�û�����   2.���Ź���   3.ע��");
							int option=Lxit.getInt();
							if (option==1)//����Ա/�û�����
							{
								while (true)
								{
									System.out.println("1.�����û�   2.��ѯ�û�   3.ɾ���û�   4.�޸��û�   5.������һ��");
									int optionone=Lxit.getInt();
									if (optionone==1)//����Ա/�û�����/�����û�
									{
										System.out.println("������Ҫ���ӵ��û�����");
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
											System.out.println("���������ӵ��û������룺");
											int adduserpassword=Lxit.getInt();
											ary[count][1]=adduserpassword;
											System.out.println("��ѡ����ݣ�");
											System.out.println("1.����  2.�չ�");
											int identity=Lxit.getInt();
											ary[count][2]=identity;
											count++;
											System.out.println("ע����ɣ�");
										}else{
											System.out.println("�û����Ѵ��ڣ�");
										}
									}
									else if (optionone==2)//����Ա/�û�����/��ѯ�û�
									{
										System.out.println("�û�\t����\t���");
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
											System.out.println("��ѯ�û��ɹ���");
										}else{
											System.out.println("���û�������������");
										}
									}
									else if (optionone==3)//����Ա/�û�����/ɾ���û�
									{
										System.out.println("������Ҫɾ�����û�����");
										int deleusername=Lxit.getInt();
										int indexdele=-1;
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]==deleusername)//�ж�Ҫɾ�����û���ݴ���
											{
												indexdele=i;
											}
										}
										if (indexdele!=-1)//���ڣ�
										{

											for (int i=indexdele;i<count-1 ;i++ )
											{
												for (int j=0;j<ary[i].length ;j++ )
												{
													ary[i][j]=ary[i+1][j];//��λɾ��
												}
											}
											count--;//ɾһ����������һ��
											
											System.out.println("ɾ���ɹ���");
										}else{
												if (deleusername==ary[0][0])//��ɾ�����û�ΪĬ�ϵ��ַ�ʱ  ��ʾһ��
												{
													System.out.println("����ɾ������Ա�û���");
												}else{//�����ڣ�
													System.out.println("��Ҫɾ�����û��������ڣ�");
											}
										}
									}
									else if (optionone==4)//����Ա/�û�����/�޸��û�
									{
										System.out.println("������Ҫ�޸ĵ��û�����");
										int amendusername=Lxit.getInt();
										int indexamend=-1;
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]==amendusername)//�жϴ治���ڣ�
											{
												indexamend=i;
												break;
											}
										}
										if (indexamend!=-1)//����
										{
											while (true)
											{
												System.out.println("�������µ��û�����");
												int newusername=Lxit.getInt();
												int indexnewname=-1;
												for (int i=0;i<count ;i++ )
												{
													if (ary[i][0]==newusername)//�ж��µ��û����Ƿ��ظ���
													{
														indexnewname=i;
														break;
													}
												}
												if (indexnewname==-1)//���ظ���
												{
													ary[indexamend][0]=newusername;//����Ҫ�޸ĵ���һ�е��û����±�
													System.out.println("�������µ����룺");
													int newpassword=Lxit.getInt();
													ary[indexamend][1]=newpassword;//~~~�����±�
													System.out.println("�������µ���ݣ�");
													int newidentity=Lxit.getInt();
													if (newidentity>0&&newidentity<3)
													{
														ary[indexamend][2]=newidentity;
													}else{
														System.out.println("���δ�޸ĳɹ���");
													}
													//~~~����±�
													System.out.println("�޸ĳɹ���");
													break;
												}else{//�ظ���
													System.out.println("����������û����Ѵ��ڣ�");
												}
											}
										}else{//�����ڣ�
											System.out.println("��Ҫ�޸ĵ��û��������ڣ�");
										}
									}
									else if (optionone==5)
									{
										System.out.println("�ѷ�����һ����");
										break;
									}
									else {
										System.out.println("��������");
									}
								}
							}
							else if (option==2)//����Ա/���Ź���
							{
								while (true)
								{
									System.out.println("1.���Ӳ���   2.��ѯ����   3.ɾ������   4.�޸Ĳ���   5.������һ��");
									int optiontwo=Lxit.getInt();
									if (optiontwo==1)
									{
										System.out.println("���������ӵ����û�����");
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
											System.out.println("������Ҫ���ӵĲ��ţ�");
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
												System.out.println("�����Ѵ��ڣ�");
											}
										}else{
											System.out.println("��������û��������ڣ�");
										}
									}
									else if (optiontwo==2)
									{
										for (int i=0;i<count ;i++ )
										{
											if (ary[i][0]!=ary[0][0])
											{
												System.out.println("�û�����"+ary[i][0]);
												for (int j=0;j<counter ;j++ )
												{
													if (aryy[j][0]==ary[i][0])
													{
														System.out.println("\t���ţ�"+aryy[j][1]);
													}
												}
											}
										}
										
									}
									else if (optiontwo==3)
									{
										System.out.println("��������Ҫɾ���Ĳ��ţ�");
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
											System.out.println("ɾ���ɹ���");
											counter--;
										}else{
											System.out.println("������Ĳ��Ų����ڣ�");
										}
									}
									else if (optiontwo==4)
									{
										System.out.println("������Ҫ�޸ĵĲ��ţ�");
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
											System.out.println("�������µĲ��ţ�");
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
												System.out.println("�޸ĳɹ���");
											}else{
												System.out.println("�����Ѵ��ڣ�");
											}
										}else{
											System.out.println("������Ĳ��Ų����ڣ�");
										}
									}
									else if (optiontwo==5)
									{
										System.out.println("�ѷ�����һ��");
										break;
									}
									else {
										System.out.println("��������");
									}
								}
								
							}
							else if (option==3)
							{
								System.out.println("�ѷ�����һ����");
								break;
							}
							else {
								System.out.println("��������");
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
						System.out.println("�û��������ڣ�");
					}else{
						System.out.println("�������");
					}
				}
			}
			else if (select==2)
			{
				System.out.println("������Ҫ���ӵ��û�����");
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
					System.out.println("���������ӵ��û������룺");
					int adduserpassword=Lxit.getInt();
					ary[count][1]=adduserpassword;
					System.out.println("��ѡ����ݣ�");
					System.out.println("1.����  2.�չ�");
					int identity=Lxit.getInt();
					ary[count][2]=identity;
					count++;
					System.out.println("ע����ɣ�");
				}else{
					System.out.println("�û����Ѵ��ڣ�");
				}
			}
			else if (select==3)
			{
				System.out.println("���˳�ϵͳ��");
				System.out.println("2017/9/28���");
				break;
			}
			else {
				System.out.println("��������");
			}
		}
	}
}