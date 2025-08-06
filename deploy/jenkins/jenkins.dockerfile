FROM jenkins/jenkins:lts

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt

ENV CASC_JENKINS_CONFIG=/var/jenkins_home/casc_configs
COPY casc_configs/ /var/jenkins_home/casc_configs/

USER root
RUN chown -R jenkins:jenkins /var/jenkins_home
USER jenkins