node{
   stage('Code Checkout'){
     git 'https://github.com/3sanathreddy/Attendancecheck'
   }
   stage('Build'){
      def mvnHome = tool name: 'Mavan', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
   }
}