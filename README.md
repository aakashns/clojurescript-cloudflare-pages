# Run ClojureScript on Cloudflare Pages

This is a template for building [Cloudflare Pages](https://pages.cloudflare.com/) applications using [ClojureScript](https://clojurescript.org/).

Live demo: https://clojurescript-cloudflare-pages.pages.dev

Follow these steps to deploy your own copy:

1. Fork this repository to your GitHub account.

2. Open it up on GitHub Codespaces (or locally) for development.

3. Run `npm build` to compile the ClojureScript code.

4. Run `npm start` to serve the application locally.

5. Run `npx wrangler login` and follow [these instructions](https://developers.cloudflare.com/workers/wrangler/commands/#use-wrangler-login-on-a-remote-machine)

6. Run `npm run deploy` to deploy the application to your CloudFlare account.

Notes:

- For local development, make sure you have Node.js, Java, and JDK installed
- `npm start` automatically recompiles the code when a file is changed in `src`
- This template generates a [`_workers.js`](https://developers.cloudflare.com/pages/functions/advanced-mode/) file for the CloudFlare pages application
- This template uses ClojureScript on the server, not in the browser

- Automated deployments are not supported as Cloudflare's build envirnoment can't compile ClojureScript
- Install the [Calva VS Code Extension](https://calva.io/) for ClojureSript syntax highlighting, code formatting, and more..

Please open an issue to report bugs and submit a PR to contribute improvements!



