Nway-JDBC����Spring JDBC����չ��Spring��JdbcTemplate����ȫ����Spring JDBC��

�����������ϵzdtjss@163.com��QQ:670950251��

�����ͨ����Դ�й����ʣ����ֲ���¼�������أ����Ե� https://github.com/zdtjss/nway-jdbc ������Ĳ�����

ʹ����SqlExecutor����־������Ҫ�������ã���Ҫ����debug����Ȼ��Ӱ�����ܣ���ΪJdbcTemplate.handleWarnings()�ȽϺ�ʱ��

������������
	ASM��Javassist

���ݿ���ֶ���Java������ӳ�����

    ȥ�����ֶ����»���(_)��Java���������ƺ��Դ�Сд�Ƚϣ������ֵ���磺���ֶ�����Ϊuser_name����ͨ������setUserName������ֵ��
	Ҳ����ͨ��com.nway.spring.jdbc.annotation.Column�޸�Ĭ�Ϲ����磺
	
      @Column("user_name")
      public String getName()
	  
Java�����ѯ֧��(JSON�ַ��������󼰶��󼯲�ѯ��Java�����ѯ�����Ʒ���)

    ������
	
        ���ֲ�����queryForBean����֧�ֵ���Java�����ѯ
		
        User usr = sqlExecutor.queryForBean("select * from t_user where id = ?", User.class, 10000);
		
    ���󼯣�
	
        ���ֲ�����queryForBeanList����֧�ֶ��Java�����ѯ
		
        List<User> users = sqlExecutor.queryForBeanList("select * from t_user where id <> ?", User.class, 10000);
		
    ��ҳ���󼯣�
	
        ���ֲ�����queryForBeanPagination����֧��Java�����ҳ��ѯ
		
        Pagination<User> users = sqlExecutor.queryForBeanPagination("select * from t_user where id <> ? order by id", new Object[]{ 10000 }, 1, 10, User.class);
		
        //ҳ������ List<T>
        users.getPageData();
		
        //ҳ����������
        users.getPageSize();
		
        //����������
        users.getTotalCount()
		
        //ҳ���С
        users.getPageSize();
		
        //ҳ��
        users.getPageCount();
		
        //��ǰҳ��
        users.getCurrentPage();
		
    Map���󼯷�ҳ��
	
        ���ֲ�����queryForMapListPagination����֧��Map�����ҳ��ѯ
		
        Pagination<Map<String, Object>> users = sqlExecutor.queryForMapListPagination("select * from t_user where id <> ? order by id", new Object[]{ 10000 }, 1, 10);
		
        usersʹ��ͬqueryForBeanPagination

	��ҳĬ��֧��Oracle��Mysql��MariaDB�������������ݿ�ķ�ҳ����ʵ��com.nway.spring.jdbc.PaginationSupport�ӿڣ�ͨ��com.nway.spring.jdbc.SqlExecutor.setPaginationSupport�������롣