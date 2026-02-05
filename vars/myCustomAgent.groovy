def call(Closure body) {
    def podYaml = libraryResource 'my_pod.yaml'
    podTemplate(yaml: podYaml) {
        node(POD_LABEL) {
            body.call() // Executes the pipeline stages defined in the Jenkinsfile
        }
    }
}
