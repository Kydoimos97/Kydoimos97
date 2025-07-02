<p align="center">
  <img 
    src="https://raw.githubusercontent.com/Kydoimos97/Kydoimos97/main/banner.png" 
    alt="Kydoimos97 Banner" 
  />
</p>

### GitHub Stats

<p align="center">
  <img 
    src="./github-metrics.svg" 
    alt="Kydoimos97 GitHub Metrics" 
  />
</p>

### Current Focus
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### Latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### Recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

---

### Profiles

- [GitHub](https://github.com/Kydoimos97)
- [LinkedIn](https://www.linkedin.com/in/willem-vd-schans/)

---

