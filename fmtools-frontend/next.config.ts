import type { NextConfig } from "next";

const nextConfig: NextConfig = {
  /* config options here */
  output: "standalone",
  compiler: {
    removeConsole: false,
  },
  deploymentId: process.env.DEPLOYMENT_ID,
};

export default nextConfig;
