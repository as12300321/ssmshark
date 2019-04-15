<template>
  <div id="app">
    <img src="./assets/logo.png">
      <!--<router-link to="//">返回sss</router-link>-->
      <router-link to="/AAAA">aaaa</router-link>
      <router-link to="/BBBB">bbbb</router-link>
      <br>
    <h1></h1>
    <router-link to="/">router</router-link>
    <router-link to="/player/p111">router1</router-link>
    <router-link to="/player/p222">router2</router-link>


    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
