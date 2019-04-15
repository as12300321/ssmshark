import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import player from '@/components/player'
import p111 from '@/components/player/p111'
import p222 from '@/components/player/p222'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },

    {
      path: '/player/:uid',
      name: 'player',
      component: player,
      children: [
        {
          path: 'p111',
          component: p111,
        },
        {
          path: 'p222',
          component: p222
        },
      ]
    },
  ]
})
