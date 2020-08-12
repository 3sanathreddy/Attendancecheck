node{
   stage('Code Checkout'){
     git 'https://github.com/3sanathreddy/Attendancecheck'
   }
   stage('Build'){
      def MAVEN_HOME = tool name: 'Mavan', type: 'maven'
      sh "${MAVEN_HOME}/bin/mvn package"
   }
}