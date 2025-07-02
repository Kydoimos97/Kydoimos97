<p align="center">
  <img 
    src="https://raw.githubusercontent.com/Kydoimos97/Kydoimos97/main/banner.png" 
    alt="Kydoimos97 Banner" 
  />
</p>

### Socials
<p align="center">
  <a href="https://github.com/Kydoimos97" target="_blank" rel="noopener noreferrer">
    <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github.svg" width="32" height="32" alt="GitHub" />
  </a>
  <a href="https://www.linkedin.com/in/willem-vd-schans/" target="_blank" rel="noopener noreferrer">
    <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/linkedin.svg" width="32" height="32" alt="LinkedIn" />
  </a>
</p>

### GitHub Stats
<p align="center">
  <img 
    src="https://github-readme-stats.vercel.app/api?username=Kydoimos97&show_icons=true&hide_border=true&theme=default" 
    alt="Kydoimos97 GitHub Stats" 
  />
</p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
