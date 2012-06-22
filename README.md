bitshow
=============
This is a clone of the nyscala-bitshow project, modified to work on Cloud Foundry.

### Deploying to Cloud Foundry

To deploy the application to Cloud Foundry, simply build the dist and push it to Cloud Foundry using the provided manifest.yml file.  You may need to modify the manifest to use a unique URL.

```bash
sbt clean compile package-dist
vmc push
Would you like to deploy from the current directory? [Yn]:
Pushing application 'bitshow'...
```