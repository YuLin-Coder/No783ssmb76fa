const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmb76fa/",
            name: "ssmb76fa",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmb76fa/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "舞蹈网站"
        } 
    }
}
export default base
