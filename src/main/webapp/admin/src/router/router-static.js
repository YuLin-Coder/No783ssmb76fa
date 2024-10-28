import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import discussyonghufenxiang from '@/views/modules/discussyonghufenxiang/list'
    import wudaokaoji from '@/views/modules/wudaokaoji/list'
    import yonghu from '@/views/modules/yonghu/list'
    import wudaozhishi from '@/views/modules/wudaozhishi/list'
    import discusswudaozhishi from '@/views/modules/discusswudaozhishi/list'
    import wudaofabu from '@/views/modules/wudaofabu/list'
    import discusswudaofabu from '@/views/modules/discusswudaofabu/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import yonghufenxiang from '@/views/modules/yonghufenxiang/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/forum',
        name: '舞蹈论坛',
        component: forum
      }
      ,{
	path: '/news',
        name: '舞蹈咨询',
        component: news
      }
      ,{
	path: '/discussyonghufenxiang',
        name: '用户分享评论',
        component: discussyonghufenxiang
      }
      ,{
	path: '/wudaokaoji',
        name: '舞蹈考级',
        component: wudaokaoji
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/wudaozhishi',
        name: '舞蹈知识',
        component: wudaozhishi
      }
      ,{
	path: '/discusswudaozhishi',
        name: '舞蹈知识评论',
        component: discusswudaozhishi
      }
      ,{
	path: '/wudaofabu',
        name: '舞蹈发布',
        component: wudaofabu
      }
      ,{
	path: '/discusswudaofabu',
        name: '舞蹈发布评论',
        component: discusswudaofabu
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/yonghufenxiang',
        name: '用户分享',
        component: yonghufenxiang
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
