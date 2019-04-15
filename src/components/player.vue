<template>
    <router-link to="p111">p111</router-link>
    <router-link to="p222">p222</router-link>
  <router-view></router-view>
</template>

<script>
  export default {
    name: "player",
    data() {
      return {
        detail: {},
        p111:'',
        p222:'',
      };

    },
    mounted() {
      //request url prams
      this.detail = this.getplayer(this.$route.params.uid);
      this.p111 = '/player/'+this.$route.params.uid+'/p111';
      this.p222 = '/player/'+this.$route.params.uid+'/p222';
    },
    beforeRouteUpdate(to, from, next) {
      this.detail = this.getplayer(to.params.uid);
      this.p111 = '/player/'+this.getplayer(to.params.uid)+'/p111';
      this.p222 = '/player/'+this.getplayer(to.params.uid)+'/p222';
      next();
    },
    methods: {
      getplayer(uid) {
        switch (uid) {
          case '1':
            return {uid: 1, name: "xssssxxx", point: 30};
          case '2':
            return {uid: 2, name: "xx2222xx", point: 60}
        }

      }
    }
  }
</script>

<style scoped>

</style>
